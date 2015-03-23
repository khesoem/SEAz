class BasicMath
{

    public int sum(int a, int b)
    {
        return a + b;
    }

    public int sub(int a, int b)
    {
        return a - b;
    }
	// TODO: multiply
    // TODO: subtract
	public int mul(int a, int b)
    {
        return a * b;
    }
	// TODO: divide
	public int div(int a, int b)
    {
        return a / b;
	}
	
	public int pow(int a, int b)
    {
		int ret = a;
		for(int i = 0; i < b - 1; i++){
			ret *= a;
		}
        return ret;
    }
}
