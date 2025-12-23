class SymbolTable:
    def __init__(self):
        self.scopes = [{}] 

    def enter_scope(self):
        self.scopes.append({})

    def exit_scope(self):
        if len(self.scopes) > 1:
            self.scopes.pop()

    def define(self, name, type_, value=None):
        current_scope = self.scopes[-1]
        current_scope[name] = {'type': type_, 'value': value}

    def lookup(self, name):
        for scope in reversed(self.scopes):
            if name in scope:
                return scope[name]
        return None

    def lookup_in_current_scope(self, name):
        return name in self.scopes[-1]

    def print_table(self):
        print("\n--- Symbol Table Status ---")
        for i, scope in enumerate(reversed(self.scopes)):
            level = len(self.scopes) - 1 - i
            print(f"Scope Level {level}:")
            for name, info in scope.items():
                print(f"  - {name} : {info}")
        print("---------------------------")