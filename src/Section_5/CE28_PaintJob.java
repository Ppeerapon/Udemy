package Section_5;

public class CE28_PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int) Math.ceil(((width * height) - (areaPerBucket *  extraBuckets)) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil((width * height) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil((area / areaPerBucket));
    }

}
