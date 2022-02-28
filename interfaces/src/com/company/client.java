package com.company;

class Client extends Person {
    private String bank;

    public Client(String name, String bank){
        super(name);
        this.bank = bank;
    }

    @Override
    public void getInfo(){
        System.out.printf("Client name: %s\nBank: %s\n", getName(), bank);
    }
}
