def number_of_steps (num)
  count = 0
  while num != 0
    if num.even?
      num /= 2
    else
      num -= 1
    end
    count += 1
  end
  count
end
