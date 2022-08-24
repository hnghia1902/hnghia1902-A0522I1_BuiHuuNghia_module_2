package ss_06_ke_thua.circle_cylinder;

    public class Point3D extends Point2D {
        protected float z;

        public Point3D() {
        }
        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }
        public float getZ() {
            return z;
        }
        public void setZ(float z) {
            this.z = z;
        }
        public float[] getXYZ()
        {
            float[] ar={this.getX(),this.getY(),this.getZ()};
            return ar;
        }
        public void setXYZ(float x,float y, float z)
        {
            this.x=x;
            this.y=y;
            this.z=z;
        }
        @Override
        public String toString() {
            return "(" + x +
                    "," + y +
                    ","+z+
                    ')';
        }
}

