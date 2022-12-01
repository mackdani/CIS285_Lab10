    public void testMixed(){
        int[] ArrayValue = new int[]{-33,-24,16,-30,12,0};
        int[] res_values = new int[]{-33,-30,-24,0,12,16};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }