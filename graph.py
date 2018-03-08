import numpy as n
import matplotlib.pyplot as plt
plt.style.use('_classic_test')
x=n.array([3954.3,3637.4800000000005,3516.5800000000004,3379.0,3096.4,2583.2599999999998])
y=n.array([72175.9,536266.342,859858.496,1146679.486,1228373.36,884691.902])
err=n.array([32648.179999999993,282813.34500000003,428381.0,573350.625,609719.22,438588.305])
plt.figure(num=None, figsize=(8,6), dpi=80, facecolor='w', edgecolor='k')
plt.errorbar(x,y,yerr=err,fmt='x')
plt.savefig("Count(x) vs Uncertainty(Y) (2).png")
