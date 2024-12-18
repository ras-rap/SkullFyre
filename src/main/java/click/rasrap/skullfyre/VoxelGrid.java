package click.rasrap.skullfyre;

import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Node;

public class VoxelGrid {
    private Voxel[][][] voxels;
    private Node rootNode;

    public VoxelGrid(int width, int height, int depth, Material material, Node rootNode) {
        this.voxels = new Voxel[width][height][depth];
        this.rootNode = rootNode;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                for (int z = 0; z < depth; z++) {
                    Material voxelMaterial = material.clone();
                    if ((x + y + z) % 2 == 0) {
                        voxelMaterial.setColor("Color", ColorRGBA.Pink);
                    } else {
                        voxelMaterial.setColor("Color", ColorRGBA.White);
                    }
                    Voxel voxel = new Voxel(x, y, z, voxelMaterial);
                    voxels[x][y][z] = voxel;
                    rootNode.attachChild(voxel.getGeometry());
                }
            }
        }
    }

    public Voxel getVoxel(int x, int y, int z) {
        return voxels[x][y][z];
    }

    public void setVoxel(int x, int y, int z, Voxel voxel) {
        voxels[x][y][z] = voxel;
        rootNode.attachChild(voxel.getGeometry());
    }
}