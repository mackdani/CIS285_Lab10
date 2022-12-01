    public void testNegatives(){
        int[] ArrayValue = new int[]{-11,-19,-8,-6,-4};
        int[] res_values = new int[]{-19,-11,-8,-6,-4};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }