    public void testPositive(){
        int[] ArrayValue = new int[]{18,13,17,20,22};
        int[] res_values = new int[]{13,17,18,20,22};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }