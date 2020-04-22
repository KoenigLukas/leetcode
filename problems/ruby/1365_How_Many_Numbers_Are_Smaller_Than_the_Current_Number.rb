# frozen_string_literal: true

def smaller_numbers_than_current(nums)
  ret = []
  nums.each do |i|
    y = 0
    nums.each do |x|
      y += 1 if x < i
    end
    ret.push y
  end
  ret
end
