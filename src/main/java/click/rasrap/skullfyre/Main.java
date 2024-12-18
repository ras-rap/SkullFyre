package click.rasrap.skullfyre;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.system.AppSettings;

public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        AppSettings settings = new AppSettings(true);
        settings.setTitle("My Awesome Game");
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);

        VoxelGrid voxelGrid = new VoxelGrid(10, 10, 10, mat, rootNode);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }
}