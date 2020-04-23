def create_target_array(nums, index)
  ret = Array.new
  x = 0
  index.each do |i|
    ret.insert(i, nums[x])
    x += 1
  end
  ret
end


puts create_target_array([0, 1, 2, 3, 4], [0, 1, 2, 2, 1])