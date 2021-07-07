def readingVertically(arr):
    ans = ''
    maxLen = max([len(word) for word in arr])
    for i in range(maxLen):
        for word in arr:
            if len(word) > i:
                ans = ans + word[i]
            else:
                pass

    return ans

ans = readingVertically(["Daisy", "Rose", "Hyacinth", "Poppy"])
print(ans) # DRHPaoyoisapaecpyiynth
