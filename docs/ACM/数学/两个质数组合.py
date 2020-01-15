while True:
    n,m = map(int,input().split())
    nums = set()

    for i in range(-500,500):
        for j in range(-500,500):
            num = i*n+j*m
            if num>0:
                nums.add(num)

    i = 0
    for num in nums:
        print(num,end=',')
        i+=1
        if i==20:
            print('')
            i=0
    print('')
