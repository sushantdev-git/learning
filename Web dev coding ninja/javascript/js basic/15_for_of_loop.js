var arr=[1,2,3,4,5,"a","b","c"]

/*
    This is shorter version of for loop
    it can be used on arr, string, object
*/
for(var i in arr){
    console.log(arr[i],i)
}
/*
    Output of above code:
    2 1
    3 2
    4 3
    5 4
    a 5
    b 6
    c 7
 */