class Pair<T, U> {
    private T first;
    private U second;
    Pair(T f, U s) { first=f; second=s; }
    T getFirst() { return first; }
    U getSecond() { return second; }
    public static void main(String[] args) {
        Pair<String,Integer> p=new Pair<>("Amol",20);
        System.out.println(p.getFirst()+" "+p.getSecond());
    }
}