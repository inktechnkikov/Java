package SayHello;


 class Bulgarian implements Person{
    private String name;

    public Bulgarian(String name){
        this.setName(name);
    }
    private void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void sayHello(){
        System.out.println("Здравей");
    }
}
