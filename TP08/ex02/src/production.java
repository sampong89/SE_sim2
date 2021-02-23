class production {
    float num1, num2, num3;

    public production() {
    }

    public production(float num1, float num2, float num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    void product() {
        float result = num1 * num2 * num3;
        System.out.println("The result of production: " + result);
    }
}
