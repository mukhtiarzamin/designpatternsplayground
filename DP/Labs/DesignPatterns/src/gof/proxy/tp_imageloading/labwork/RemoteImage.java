package gof.proxy.tp_imageloading.labwork;

public class RemoteImage implements Image{
    @Override
    public void display(String actualSource) {
        System.out.println("Loaing image from actual source "+actualSource);
    }
}
