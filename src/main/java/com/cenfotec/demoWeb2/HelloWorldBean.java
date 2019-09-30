package com.cenfotec.demoWeb2;

public class HelloWorldBean {
    private  String mensaje;
    public HelloWorldBean(String mensaje)
    {
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "mensaje123='" + mensaje + '\'' +
                '}';
    }
}
