import io.javalin.Javalin;


public class App {

    public static void main(String[] args) {
        Memory game = new Memory();

        Javalin app = Javalin.create()
                .enableStaticFiles("/public")
                .start(7000);

        app.get("/card", ctx -> {
            int index = Integer.parseInt(ctx.queryParam("idx"));
            game.openCard(index);
            ctx.result(game.toString());
        });
    }
}