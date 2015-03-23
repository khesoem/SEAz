class BasicMath
{

    public int sum(int a, int b)
    {
        return a + b;
    }

    // TODO: subtract
	// TODO: multiply
	// TODO: divide
	
	public int pow(int a, int b)
    {
		int ret = a;
		for(int i = 0; i < b - 1; i++){
			ret *= a;
		}
        return ret;
    }
}
