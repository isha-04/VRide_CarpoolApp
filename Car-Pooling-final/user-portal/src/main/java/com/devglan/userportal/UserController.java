package com.devglan.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/users"})

public class UserController {
	
    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{emp_id}"})
    public User findOne(@PathVariable("emp_id") int emp_id){
        return userService.findById(emp_id);
    }
        
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User findByEmailAndPsw(@RequestBody User loginUser) 
	{
		return userService.findByEmailAndPsw(loginUser.getEmail(),loginUser.getPassword());
	}
    
    @PutMapping(path = {"/{emp_id}"})
    public User update(@PathVariable("emp_id") int emp_id, @RequestBody User user){
        user.setEmployeeId(emp_id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{emp_id}"})
    public User delete(@PathVariable("emp_id") int emp_id) {
        return userService.delete(emp_id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
