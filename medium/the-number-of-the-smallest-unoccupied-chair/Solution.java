
class Solution {
    public int smallestChair(int[][] times, int targetFriend) {

        List<int[]> events = new ArrayList<>();

        for (int i = 0; i < times.length; i++) {
            events.add(new int[] { times[i][0], i, 1 });
            events.add(new int[] { times[i][1], i, -1 });
        }

        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[2], b[2]);
            }
        });

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        int[] chairs = new int[times.length];

        int nextChair = 0;

        for (int[] event : events) {
            int time = event[0];
            int friendIndex = event[1];
            int type = event[2];

            if (type == 1) {

                if (availableChairs.isEmpty()) {

                    chairs[friendIndex] = nextChair++;
                } else {

                    chairs[friendIndex] = availableChairs.poll();
                }

                if (friendIndex == targetFriend) {

                }
            } else {
                availableChairs.offer(chairs[friendIndex]);
            }
        }

        return chairs[targetFriend];
    }
}
