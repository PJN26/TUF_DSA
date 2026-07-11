class Solution {
    public int findMaximumCookieStudents(int[] student, int[] cookie) {
        Arrays.sort(student);
        Arrays.sort(cookie);

        int satisfied = 0;

        int i = 0;
        int j = 0;

        while(i < student.length && j < cookie.length) {
            if(cookie[j] >= student[i]) {
                satisfied++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return satisfied;
    }
}