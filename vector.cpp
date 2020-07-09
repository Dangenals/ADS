#include <iostream>
#include <vector>
using namespace std;
int main(){
	int n;
	vector<int> v(n);
	
	for(int i=0;i<n;i++)
		v[i]=i;

	v.insert(v.begin()+3,20);
	
	for(int i=0;i<v.size();i++)
		cout<<v[i]<<" ";
		cout<<endl;
}
