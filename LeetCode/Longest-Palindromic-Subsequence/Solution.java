    /*
        s = "bbbab"
        o/p = 4 (bbbb) this is the max length subseq from i/p s

        each char in the input s
           // only cater for cases when the palidrome is on odd length
            -> consider that as the center of a potential palidrome
            -> have 2 ptrs i and j, moving in opposite directions
                    -> till they are equals s[i] == s[j] (len = +2)
                    -> not equal, then we either skip i or j and move forward in their resp. directions
                        till either reaches the end ( i == 0 and for j == s.size() - 1 )


            // for even length potential palidromes
            -> we will consider 2 positions as center, 
            -> i which will move in left direction and k which will move is right direction
            -> everytime will move both forward only when i = j
            -> otherwise will move either i or j till they are equals for one of them  ends 

    */

    int size = s.length();
    int result = 1;

    for( int i = 1 ; i < size ; i++ ){

        int even = 0;
        if( s.charAt(i) == s.charAt(i-1) ) even = solve( s , i - 1 , i );
        int odd = 1 + solve( s , i - 1 , i + 1 );
        result = Math.max( result , Math.max( even , odd ) );

    }
    
    return result;
}

private int solve( String s , int i , int j ){

    // base case
    if( i < 0 || j > s.length() - 1 ){
        return 0;
    }

    // if both ptrs are equal

    if( s.charAt(i) == s.charAt(j) ){
        return  2 + solve( s , i - 1 , j + 1 );
    }

    // if not equal
    int skipJ = solve( s , i , j + 1 );
    int skipI = solve( s , i - 1, j );

    return Math.max( skipI , skipJ );
}