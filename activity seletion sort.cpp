#include<iostream>
#include<algorithm>
using namespace std;
struct item{
//string name;
double weight, price,unitprice;
};
bool comparator(item a,item b)
{
    return a.unitprice>b.unitprice;
}
int main(){
int n;
double cap;
//cout<<"Enter-> n->capacity"<<endl;
cin>>n>>cap;//how many item wants to include
item arr[n+3];
//cout<<"Enter ->name ->weight->price"<<endl;
for(int i=0; i<n;i++)
{
    cin>>arr[i].price>>arr[i].weight;
    arr[i].unitprice=arr[i].price/arr[i].weight;
}

sort(arr, arr + n, comparator);
//cout<<"sorted array->name ->weight->price"<<endl;
/*for(int i=0;i<n;i++)
{
    cout<<arr[i].name<<" "<<arr[i].weight<<" "<<arr[i].price<<" "<<arr[i].unitprice<<endl;;
}*/
double profit=0;
for(int i=0;i<n;i++)
{
    if(cap>=arr[i].weight)
    {
        cap=cap-arr[i].weight;
        profit=profit+arr[i].price;

    }
    else
    {
        profit=profit+cap*arr[i].unitprice;
        break;
    }
}
printf("%.10lf\n",profit);
}

