func twoSum(nums []int, target int) []int {
    resmap:=map[int]bool{}

    index1:=-1
    index2:=-1

    dataIndexToFind:=-1

    for i,num:=range(nums){
        diff:=target-num // 9-7=2

        _,exist:=resmap[diff]
        if exist{
            index1=i // 1
            dataIndexToFind=diff //2
            break;
        }else{
            resmap[num]=true
        }
    }

    for i,data:=range(nums){
        if data==dataIndexToFind{
            index2=i
            break
        }
    }

    return []int{index1,index2}

}