package click.rasrap.skullfyre;

import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class Voxel {
    private Geometry geometry;

    public Voxel(float x, float y, float z, Material material) {
        Box box = new Box(0.1f, 0.1f, 0.1f); // Each voxel is a 0.2x0.2x0.2 cube
        geometry = new Geometry("Voxel", box);
        geometry.setMaterial(material);
        geometry.setLocalTranslation(x, y, z);
    }

    public Geometry getGeometry() {
        return geometry;
    }
}