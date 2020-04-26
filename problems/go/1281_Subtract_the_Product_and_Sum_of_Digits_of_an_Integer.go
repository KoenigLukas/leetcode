package _go

func subtractProductAndSum(n int) int {
	sum := 0
	prod := 1

	for n >= 1{
		prod *= n % 10
		sum += n % 10
		n /= 10
	}
	return prod-sum
}