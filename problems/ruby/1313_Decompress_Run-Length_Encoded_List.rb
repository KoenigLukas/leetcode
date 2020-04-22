def decompress_rl_elist(nums)
  ret = []
  i = 0
  while i < nums.size-1
    x = 0
    while x < nums[i]
      ret.push nums[i+1]
      x += 1
    end
    i += 2
  end
  ret
end