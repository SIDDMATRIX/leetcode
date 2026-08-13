1class OrderedStream {
2
3    String[] stream;
4    int ptr ;
5
6    public OrderedStream(int n) {
7        stream =new String[n+1];
8        ptr = 1;
9    }
10    
11    public List<String> insert(int idKey, String value) {
12        stream[idKey] = value;
13        List<String> result =new ArrayList<>();
14        while(ptr< stream.length&&stream[ptr] !=null){
15            result.add(stream[ptr]);
16            ptr++;
17        }
18
19        return result;
20    }
21}
22
23/**
24 * Your OrderedStream object will be instantiated and called as such:
25 * OrderedStream obj = new OrderedStream(n);
26 * List<String> param_1 = obj.insert(idKey,value);
27 */