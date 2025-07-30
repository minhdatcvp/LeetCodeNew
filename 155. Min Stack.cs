public class MinStack {
    List<int> minArr;
    List<int> arr;
    public MinStack()
    {
        arr = new List<int>();
        minArr = new List<int>();
    }

    public void Push(int val)
    {
        arr.Add(val);
        int min = arr.Count - 2 < 0 ? val : minArr[arr.Count - 2];
        minArr.Add(val < min ? val : min);
    }

    public void Pop()
    {
        minArr.RemoveAt(minArr.Count - 1);
        arr.RemoveAt(arr.Count - 1);
    }

    public int Top()
    {
        return arr[arr.Count - 1];
    }

    public int GetMin()
    {
        return minArr[arr.Count - 1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.Push(val);
 * obj.Pop();
 * int param_3 = obj.Top();
 * int param_4 = obj.GetMin();
 */