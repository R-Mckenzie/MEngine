package TestGame;

import MEngine.Core.*;
import MEngine.Game.Scene;
import MEngine.Game.SceneManagerGame;
import MEngine.Maths.Vec3;
import MEngine.Rendering.Renderer;

public class Main{
    static IWindow window=new Window(800, 600, "test");
    static IRenderer renderer=new Renderer(new Vec3(1,1,1));
    static Scene testScene=new TestScene();
    static IGame game=new SceneManagerGame(renderer,"testScene", testScene);
    static Engine engine=new Engine(game, renderer, window);

    public static void main(String[] args){
        engine.start();
    }
}
