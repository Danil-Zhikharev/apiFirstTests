import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestDataType {
    private static final String URL = "http://192.168.30.181:4040/backend/rest";


    @Test
    public void getTemplateOfDataType() {
        List<TemplateOfListMeasurements> templateOfListMeasurements = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "/data-export-template?owner-login")
                .then().log().all()
                .extract().body().jsonPath().getList("data", TemplateOfListMeasurements.class);
    }
}


