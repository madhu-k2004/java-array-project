public class arvowel{
    public static void main(String[]args){
        char arr[]={'a','b','c','e','i','o','u','d','g','h','x'};
        for(int i=0; i < arr.length; i++) {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i'|| arr[i]=='o' || arr[i]=='u'){
                System.out.println(arr[i]);
            }
        }
    }
}