package br.com.stefanini.developerup;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.stefanini.developerup.model.Produto;
import br.com.stefanini.developerup.parser.ProdutoParser;


/**
 * @author Stefanini DeveloperUp
 * email maratona@gmail.com
 * created 20/07/2022
 * @version 0.1.0
 */
@QuarkusTest
public class ProdutoRestTest {

    private final static String URL = "/api/produto";

    @Test
    public void testarListarProdutoSucessoTest() {
        given()
            .contentType(ContentType.JSON)
            .body("")
            .when()
            .get(URL)
            .then()
            .statusCode(200);
    }

    @Test
    public void ProdutoParserTest() {
        Produto p = new Produto();
        p.setId(p.getId());
        p.setNome("nome");
        p.setComprado(true);

        ProdutoParser pp = new ProdutoParser();

        Assertions.assertEquals(
            null,
            pp.dto(p),
            "Retornou valor diferente de null");
    }
}