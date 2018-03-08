import numpy as n
import matplotlib.pyplot as plt
plt.style.use('_classic_test')
x=n.array([0.01,0.00625,0.005,0.004,0.003125,0.0025])
y=n.array([268.64,732.1800000000001,927.28,1070.8200000000002,1108.32,940.5800000000002])
err=n.array([3.8499999999999943,17.950000000000045,4.100000000000023,6.399999999999977,0.5,1.3000000000000114])
plt.figure(num=None, figsize=(8,6), dpi=80, facecolor='w', edgecolor='k')
plt.errorbar(x,y,yerr=err,fmt='x')
plt.savefig("Time(x) vs Uncertainty(Y) (2).png")
