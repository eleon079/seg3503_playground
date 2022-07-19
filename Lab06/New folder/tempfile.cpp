#include <bits/stdc++.h>
#include <stdlib.h>     /* srand, rand */
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

//This is LRU

void algLRU(int frame_size, int* ref, int len, int ctime){
    
    int page; 
    int cnt = 0;
    vector<pair<int, int> > arr;
    for (int i = 0; i < frame_size; i++) {
    arr.push_back(make_pair(-1, ctime));
    }

    for (int i = 0; i < len; i++) { 
        page = ref[i]; 
        auto it = arr.begin(); 

        for (it = arr.begin(); it != arr.end(); it++) { 
            if (it->first == page) { 
                break; 
            } 
        } 

        if (it != arr.end()) { 
            it->second = ctime; 
        } 

        else { 
            vector<pair<int, int> >::iterator pos; 
            pos = arr.begin(); 
            int min = pos->second; 
            for (auto itr = arr.begin(); itr != arr.end(); itr++) { 
                if (itr->second < min) { 
                    pos = itr; 
                    min = pos->second; 
                } 
            } 
            arr.erase(pos); 
            arr.push_back(make_pair(page, ctime)); 
            cnt++; 
        } 
        ctime++; 
    } 
    cout << "The number of page faults is : " << cnt << endl; 

}

int
main (){

    srand((unsigned) time(0));
    int numcadres = (rand() % 7) + 1;

    int x;
    int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
    int n = sizeof (pages) / sizeof (pages[0]);

    cout << "Please Select an Algorithm \n" ;
    cout << "Press 1 for FIFO or 2 for LRU : ";
    cin >> x;

    if (x == 1)
    {
        int i,j,n,a[50],frame[10],no,k,avail,count=0;

        printf("\n ENTER THE NUMBER OF PAGES:\n");

        scanf("%d",&n);

        printf("\n ENTER THE PAGE NUMBER :\n");

        for(i=1;i<=n;i++)

        scanf("%d",&a[i]);

        printf("\n ENTER THE NUMBER OF FRAMES :");

        scanf("%d",&no);

        for(i=0;i<no;i++)

        frame[i]= -1;

        j=0;

        printf("\tref string\t page frames\n");

        for(i=1;i<=n;i++) {

            printf("%d\t\t",a[i]);

            avail=0;

            for(k=0;k<no;k++)

            if(frame[k]==a[i])

            avail=1;

            if (avail==0) {

                frame[j]=a[i];

                j=(j+1)%no;

                count++;

                for(k=0;k<no;k++)

                printf("%d\t",frame[k]);

            }

            printf("\n");

        }

        printf("Page Fault Is %d",count);

        return 0;
    }

    if (x == 2)
    {
        cout << "Algorithm = LRU \n";
        cout << "Number of Frames: ";
        cout << numcadres;
        cout << "\nReference Pages = ";
        cout << "{";
        for (int i = 0; i < n; i++)
        {cout << pages[i];  cout << ", ";}
        cout << "}\n";

        int ctime = 0;
        algLRU(numcadres, pages, n, ctime);

    }
    if(x>2 || x< 1){
        cout << "Please restart the program and select a valid option. \n";
        return 0;
    }

    return 0;
}