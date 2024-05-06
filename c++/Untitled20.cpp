#include<iostream>

int main(){

       /*  Read input as specified in the question.
	* Print output as specified in the question.
	*/
int S,E,W;
    cin>>S>>E>>W;
    while(S<=E){
        int temp((5.0/9)*(S-32));
        cout<<S<<" "<<temp<<endl;
            S=S+W;
    }
}
