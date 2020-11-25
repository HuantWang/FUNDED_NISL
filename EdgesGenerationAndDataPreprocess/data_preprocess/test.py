import tensorflow as tf
import numpy

# 创造数据
x_data = numpy.random.rand(100).astype(numpy.float32)
y_data = x_data * 0.1 + 0.3

print(x_data, y_data)

Weights = tf.Variable(tf.random_uniform([1], -1.0, 1))
biases = tf.Variable(tf.zeros([1]))
y = Weights * x_data + biases

loss = tf.reduce_mean(tf.square(y - y_data))

optimizer = tf.train.GradientDescentOptimizer(0.5)
train = optimizer.minimize(loss)
init = tf.global_variables_initializer()

sess = tf.Session()
sess.run(init)
for step in range(201):
    sess.run(train)
    if step % 20 == 0:
        print(step, sess.run(Weights), sess.run(biases))