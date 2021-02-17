# %%
def fibonacci(n, cache = {}):
    if n <= 1:
        print(f"Base case: {n}")
        return n
    elif n not in cache:
        print(f"Calculating: {n}")
        print(f"Cache state:{cache}")
        cache[n] = fibonacci(n-1) + fibonacci(n-2)
        print(f"Cache state:{cache}")
    print(f"Cache retrieval: {n}")
    return cache[n]
# %%
last = fibonacci(10)
# %%

# %%
