nums=[23,24,25,26]
function shownumber()
{
	for(i=0;i<nums.length;i++)
		alert(nums[i])
}

function sum()
{
	sum=0;
	for(i=0;i<nums.length;i++)
		sum+=nums[i];
	alert(sum);
}

function multiply()
{
	multiply=1;
	for(i=0;i<nums.length;i++)
		multiply*=nums[i];
	alert(multiply);
}