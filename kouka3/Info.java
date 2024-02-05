public  class Info {
    private String name;
    private String year;
    // private String price;
    
    Info(String name,String year){
        this.name=name;
        this.year=year;
        }

    public void print(){
        System.out.println(this.name + " " + this.year);
    }
}
