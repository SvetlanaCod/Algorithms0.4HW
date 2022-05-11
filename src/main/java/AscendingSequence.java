public class AscendingSequence {

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];

            for (int i = 0; i < result.length; i++) { //по индексам массива
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }
            return result;
            //      int j = 0;
            // for ( int i = start; i <= end; i += step) {   //тут мы проходим по значениям,
            //       if (j<result.length){                   //а не по индексам массива
            //           result[j] = i;                     это сложный способ
            //           j++;
            //        }
            //  }
            // return result;

        }

        return new int[]{};
    }


}
