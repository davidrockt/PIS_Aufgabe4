import io.javalin.Javalin;
import main.java.Memory;


public class App {

    public static void main(String[] args) {
        Memory game = new Memory();

        Javalin app = Javalin.create()
                .enableStaticFiles("/public")
                .start(7000);

        app.get("/card", ctx -> {
            // number.put((ctx.queryParam("val").charAt(0)));
            game.openCard(ctx.queryParam("idx").charAt(0));
            ctx.result("bla");
        });
    }
}