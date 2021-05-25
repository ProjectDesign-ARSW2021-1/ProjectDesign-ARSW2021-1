package edu.escuelaing.arsw.projecDesign.security.jwt;

import edu.escuelaing.arsw.projecDesign.entities.UsuarioPrincipal;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    private final static Logger logger= LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;
    
    @Value("${jwt.expiration}")
    private int expiration;


    public String generateToken(Authentication authentication){
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
            return Jwts.builder()
                    .setSubject(usuarioPrincipal.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(new Date().getTime() + expiration*1000))
                    .signWith(SignatureAlgorithm.HS512,secret)
                    .compact();
    }

    public String getNombreUsuarioFromToken(String token){
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJwt(token);
            return true;
        }catch (MalformedJwtException e){
            logger.error("token malformado");
        }catch (UnsupportedJwtException ex){
            logger.error("token no soportado");
        }catch (ExpiredJwtException e){
            logger.error("token expirado");
        }catch (IllegalArgumentException e){
            logger.error("token vacio");
        }catch (SignatureException e){
            logger.error("fail en la firma");
        }
        return false;
    }


}
