package hellojava;

import java.util.Scanner;

public class hellojava {
	static int binary(int a[], int l, int r, int x) {
		if (r >= l) {
			int mid = 1 + (r - l) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] > x) {
				return binary(a, 1, mid - 1, x);
			}
			return binary(a, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu trong mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int x = 2;
		int slove = binary(a, 0, n - 1, x);
		if (slove == -1) {
			System.out.println("K tim thay vi tri");
		} else {
			System.out.printf("Vi tri la %d ", slove);
		}
	}
}
