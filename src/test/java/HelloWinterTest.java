import com.syntexpro.qa.dev.HelloWinter;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class HelloWinterTest {
    HelloWinter helloWinter;

    @BeforeEach
    void setUp(){
        helloWinter = new HelloWinter();
    }

    @Test
    @DisplayName("HelloSaturday")
    @Order(1)
     void Test1() {
        HelloWinter helloWinter = new HelloWinter();
        Assertions.assertEquals("11/04/2023-Coldest weather today!", helloWinter.helloSaturday());
    }

    @Test
    @DisplayName("HelloSaturday")
    @Order(2)
     void Test2() {
        HelloWinter helloWinter = new HelloWinter();
        Assertions.assertEquals("11/05/2023-Coldest weather today!", helloWinter.helloSunday());
    }

    @Test
    @DisplayName("HelloMonday")
    @Order(3)
    void rTest3() {
        HelloWinter helloWinter = new HelloWinter();
        Assertions.assertEquals("11/06/2023-Coldest weather today!", helloWinter.helloMonday());
    }

    @Test
    @DisplayName("HelloTuesday")
    @Order(4)
    void Test4() {
        HelloWinter helloWinter = new HelloWinter();
        Assertions.assertEquals("11/07/2023-Coldest weather today!", helloWinter.helloTuesday());
    }

    @Test
    @DisplayName("HelloWednesday")
    @Order(5)
    void Test5() {
        HelloWinter helloWinter = new HelloWinter();
        Assertions.assertEquals("11/08/2023-Coldest weather today!", helloWinter.helloWednesday());
    }

}























