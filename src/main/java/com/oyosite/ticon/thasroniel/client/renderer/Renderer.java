package com.oyosite.ticon.thasroniel.client.renderer;

public class Renderer implements Runnable{
    private final Thread thread;
    public Renderer(){
        thread = new Thread(this);
    }

    public void start(){
        thread.start();
    }

    @Override
    public void run() {

    }
}
