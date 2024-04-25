package src.finalMaterial.week14_25April_thurs;

public class JMLArrays {

    /*@
        requires orig != null;
        ensures orig.length == \result.length;
        ensures ((\forall int k; k >= 0 && k < orig.length; \result[k] == orig[k].length()));
     */
    public static int[] getStringLengths(String[] orig) {
        if (orig == null) {
            throw new IllegalArgumentException("precondition violated: array shouldn't be null");
        }

        int[] resultArray = new int[orig.length];
        for (int i = 0; i < orig.length; i++) {
            resultArray[i] = orig[i].length();
        }

        assert resultArray.length == orig.length;

        for (int i = 0; i < orig.length; i++) {
            assert resultArray[i] == orig[i].length();
        }

        return resultArray;
    }

    /*@
        requires nums != null;
        requires nums.length >= 1;
        ensures ((\exists int k; k >= 0 && k < nums.length; \result == nums[k]));
        ensures (\forall int k; k >= 0 && k < nums.length; \result <= nums[k]);
    */
    public static int min(int[] nums) {
        return -1;
    }
}
